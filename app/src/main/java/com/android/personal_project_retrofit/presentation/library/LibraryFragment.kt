package com.android.personal_project_retrofit.presentation.library

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.android.personal_project_retrofit.presentation.main.MainSharedEventForLibrary
import com.android.personal_project_retrofit.presentation.main.MainSharedViewModel
import com.android.personal_project_retrofit.databinding.LibraryFragmentBinding

class LibraryFragment : Fragment() {
    companion object {
        fun newInstance() = LibraryFragment()
    }

    private var _binding: LibraryFragmentBinding? = null
    private val binding get() = _binding!!

    private val recyclerViewAdapter by lazy {
        LibraryAdapter { position, item ->
            viewModel.removeLibraryItem(position)
            sharedViewModel.updateSearchItem(item)
        }
    }

    private val viewModel: LibraryViewModel by viewModels()
    private val sharedViewModel: MainSharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LibraryFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initViewModel()
    }

    private fun initView() = with(binding) {

        recyclerView.adapter = recyclerViewAdapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    private fun initViewModel() = with(viewModel) {

        list.observe(viewLifecycleOwner) {
            recyclerViewAdapter.submitList(it)
        }

        sharedViewModel.libraryEvent.observe(viewLifecycleOwner) { event ->
            when(event) {
                is MainSharedEventForLibrary.UpdateLibraryItems -> {
                    viewModel.updateLibraryItems(event.items)
                }
                else -> Unit
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}