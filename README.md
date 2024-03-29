<H1>📽️ 프로젝트</H1>
<b>Searcher 앱은 Retrofit과 카카오API를 이용한 이미지 검색 앱 입니다</b>

<H1>🔬 주요 기능 </H1>
- 이미지 검색 <br><br>
- 이미지 북마크에 저장<br><br>
- sharedPreference를 이용한 마지막 검색어 저장

<H1>🎯 기술 스택</H1>

|제목|내용|
|------|---|
|Language|Kotlin|
|jetpack|AAC ViewModel, LiveData, ViewBinding|
|network|Retrofit2, OkHttp3, Coroutine|
|data|SharedPreference|
|ImageLoading|Glide|

<H1> 🎄 Architecture</H1>
- <b>CleanArchitecture, MVVM</b>을 100% 구현했습니다. <br><br>
- <b>Data, Domain, Presentation</b>으로 패키지를 나누어 개발했습니다.<br><br>
- 모든 비즈니스 로직은 <b>Viewmodel과 LiveData</b>로 처리했습니다. <br><br>
  ex) <b>presentation(viewModel) -> domain(usecase) -> data(repository</b>) <br><br>
- 간단한 Toast 메시지 출력조차 <b>ViewModel을</b>을 이용해 처리했습니다.<br>
    View에서는 단순히 <b>Viewmodel</b>로 부터 받는 데이터를 받아 수동적으로 뷰만 처리하게 구성했습니다.

# 🎯 작동 영상
![Screen_recording_20240204_072326 (1)](https://github.com/choco5732/Searcher/assets/81561579/0dea41ce-5d3b-4aec-92f0-298946cfa19a)

<H1> 💡 배운 점</H1>
- <b>Retrofit2</b>와 <b>Okhttp3</b>를 통해 안드로이드에서 HTTP통신을 구현해 볼 수 있었습니다.<br><br>
- <b>MVVM</b>을 패턴을 도입해, 기존의 <b>MVC</b> 아키텍처의 문제점을 개선시켜 볼 수 있었습니다.<br><br>
- <b>CleanArchitecture</b>를 기반으로 단순 UI처리부터 모든 비즈니스 로직을 <b>ViewModel</b>로 처리해 <b>MVVM</b>을 완벽히 구현해 볼 수 있었습니다.



