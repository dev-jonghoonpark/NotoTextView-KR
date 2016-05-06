# NotoTextView

## 이게 뭐죠?
`NotoTextView` 는 Noto sans 폰트의 fontWeight 가 적용 된 TextView를  
xml 상에서도 쉽게 구현하기 위한 라이브러리 입니다.  

경량화 된 Noto sans 는 [http://theeluwin.github.io/NotoSansKR-Hestia/](http://theeluwin.github.io/NotoSansKR-Hestia/) 에서 받았고  
전체적인 틀은 [http://storyofdream.tistory.com/120](http://storyofdream.tistory.com/120)를 기반으로 작업하였습니다.


## 왜 만들었냐고요?
외주를 하던 중 디자이너님이 Noto sans 폰트로 꼭 작업하고 싶다고 하셔서 만들게 되었습니다.  
이번 기회에 커스텀 뷰로 라이브러리도 만들어보고 maven을 통한 라이브러리 배포도 해보고 싶어  
짧은 코드지만 깃헙에 올리고 jcenter 라이브러리로 배포를 시도하였습니다.

## 어떻게 쓰는거냐고요?  

fontWeight 에 필요한 weight값(thin, light, demilight, regular, medium, bold, black)을 넣으면 됩니다.  
  
```xml
 <io.chooco13.NotoTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="thin"
        android:textSize="36sp"
        app:fontWeight="thin" />

    <io.chooco13.NotoTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="light"
        android:textSize="36sp"
        app:fontWeight="light" />

    <io.chooco13.NotoTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="demilight"
        android:textSize="36sp"
        app:fontWeight="demilight" />

    <io.chooco13.NotoTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="regular"
        android:textSize="36sp"
        app:fontWeight="regular" />

    <io.chooco13.NotoTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="medium"
        android:textSize="36sp"
        app:fontWeight="medium" />

    <io.chooco13.NotoTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="bold"
        android:textSize="36sp"
        app:fontWeight="bold" />

    <io.chooco13.NotoTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="black"
        android:textSize="36sp"
        app:fontWeight="black" />
```

## 지금 이 소스로 뭐가 되냐구요?
xml에서 입력한 fontWeight 값을 통해 해당 값의 TextView 생성이 가능합니다.  
![NotoTextView](http://i.imgur.com/ttEICsx.png)  

## 그래서, 하고 싶은 말은...?
처음 경험해보는거여서 그런지 짧은 코드임에도 불구하고 오래 걸린 느낌이 들었습니다.  
그래도 좋은 경험이였고 재밌었습니다.

## 2015.05.07 AM 6:00
- 라이브러리 생성 및 문서화
- bintray 배포 및 jcenter link 신청
