# javaStudyBasic
### 자바 공부 기록 - 기본편

#### 나도 코딩의 [자바 기본편](https://www.inflearn.com/course/%EB%82%98%EB%8F%84%EC%BD%94%EB%94%A9-%EC%9E%90%EB%B0%94-%EA%B8%B0%EB%B3%B8)을 학습하고 [자바의 신 1, 2 편](https://search.shopping.naver.com/book/catalog/32482010229?cat_id=50010920&frm=PBOKPRO&query=%EC%9E%90%EB%B0%94%EC%9D%98+%EC%8B%A0&NaPm=ct%3Dlhy78le8%7Cci%3D1cfb2540efffd29b8003a5c8fe1659fcb23bd311%7Ctr%3Dboknx%7Csn%3D95694%7Chk%3D05c2d1565f132b631a49b795ffa1c5cebbc3f79b)을 참고하여 작성한 글입니다.
#### Notion - [자바의 신 1, 2권 정리](https://oceanic-fuschia-167.notion.site/1-2-f21ec44d9d7a4a9b8cec8af5dbcd2c63)
 
 ---
<details>
  <summary><strong>chapter01 - 자료형과 변수</strong></summary>

  - [자료형](#자료형)
  - [변수](#변수)
  - [주석](#주석)
  - [변수네이밍](#변수네이밍)
  - [상수](#상수)
  - [형변환](#형변환)

</details>

<details>
  <summary><strong>chapter02 - 연산자</strong></summary>

  - [산술 연산자](#산술-연산자)
  - [대입 연산자](#대입-연산자)
  - [비교 연산자](#비교-연산자)
  - [논리 연산자](#논리-연산자)
  - [삼항 연산자](#삼항-연산자)

</details>

<details>
  <summary><strong>chapter03 - 문자열</strong></summary>

  - [문자열](#문자열)
  - [문자열 비교](#문자열-비교)
  - [특수문자](#특수문자)

</details>

<details>
  <summary><strong>chapter04 - 제어문</strong></summary>

  - [If](#if)
  - [Else](#else)
  - [Else If](#else-if)
  - [Switch Case](#switch-case)
  - [For](#for)
  - [While](#while)
  - [Do While](#do-while)
  - [이중반복문](#이중반복문)
  - [구구단](#구구단)
  - [Break](#break)
  - [Continue](#continue)

</details>

<details>
  <summary><strong>chapter05 - 배열</strong></summary>

  - [배열](#배열)
  - [배열 순회](#배열-순회)
  - [다차원 배열](#다차원-배열)
  - [다차원 배열 순회](#다차원-배열-순회)
  - [아스키코드](#아스키코드)

</details>

<details>
  <summary><strong>chapter06 - 메소드</strong></summary>

  - [메소드](#메소드)
  - [전달값(파라미터)](#전달값파라미터)
  - [반환값(Return)](#반환값return)
  - [전달값과 반환값](#전달값과-반환값)
  - [메소드 오버로딩](#메소드-오버로딩)
  - [메소드 필요이유](#메소드-필요이유)
  - [변수의 범위](#변수의-범위)
  - [Main 메소드](#main-메소드)

</details>

<details>
  <summary><strong>chapter07 - 클래스</strong></summary>

  - [클래스](#클래스)
  - [인스턴스 변수](#인스턴스-변수)
  - [클래스 변수](#클래스-변수)
  - [메소드](#메소드)
  - [메소드 오버로딩](#메소드-오버로딩)
  - [클래스 메소드](#클래스-메소드)
  - [This](#this)
  - [생성자]([#생성자](https://www.notion.so/d6f6910447f3465bab0d12e5135354c7?pvs=4#c0775fecc07a49a9a2df0f11e6a740e4))
  - [Getter 와 Setter](#getter-와-setter)
  - [접근 제어자](#접근-제어자)
  - [패키지](#패키지)
  - [상속](#상속)
  - [메소드 오버라이딩](#메소드-오버라이딩)
  - [다형성](#다형성)
  - [Super](#super)
  - [참조 (Reference)](#참조-reference)
  - [Final](#final)
  - [열거형](#열거형)

</details>

<details>
  <summary><strong>chapter08 - 추상클래스와 인터페이스</strong></summary>

  - [추상 클래스](#추상-클래스)
  - [인터페이스](#인터페이스)

</details>

<details>
  <summary><strong>chapter09 - 제네릭스</strong></summary>

  - [제네릭스](#제네릭스)
  - [제네릭 클래스](#제네릭-클래스)
  - [Wrapper 클래스](#wrapper-클래스)
  - [ArrayList](#arraylist)
  - [LinkedList](#linkedlist)
  - [HashSet](#hashset)
  - [HashMap](#hashmap)
  - [Iterator](#iterator)

</details>

<details>
  <summary><strong>chapter10 - 익명클래스, 람다와 스트림</strong></summary>

  - [익명 클래스](#익명-클래스)
  - [람다식](#람다식)
  - [함수형 인터페이스](#함수형-인터페이스)
  - [스트림](#스트림)

</details>

<details>
  <summary><strong>chapter11 - 예외처리</strong></summary>

  - [예외처리 (Try Catch)](#예외처리-try-catch)
  - [Catch 구문](#catch-구문)
  - [예외 발생시키기 (Throw)](#예외-발생시키기-throw)
  - [Finally 구문](#finally-구문)
  - [Try With Resources](#try-with-resources)
  - [사용자 정의 예외](#사용자-정의-예외)
  - [예외 처리 미루기 (Throws)](#예외-처리-미루기-throws)

</details>

<details>
  <summary><strong>chapter12 - 쓰레드</strong></summary>

  - [Thread](#thread)
  - [Runnable](#runnable)
  - [Join](#join)
  - [다중 쓰레드](#다중-쓰레드)
  - [동기화](#동기화)

</details>

<details>
  <summary><strong>chapter13 - 입출력과 파일</strong></summary>

  - [입력](#입력)
  - [출력](#출력)
  - [파일 다루기](#파일-다루기)
  - [폴더 다루기](#폴더-다루기)
  - [파일과 폴더 조회](#파일과-폴더-조회)
  - [파일 읽고 쓰기](#파일-읽고-쓰기)
  - [파일 삭제](#파일-삭제)

</details>


#### chapter1
  >자료형과 변수
   * 자료형
   * 변수
   * 주석
   * 변수네이밍
   * 상수
   * 형변환
 
 #### chapter2
  >연산자
   * 산술 연산자
   * 대입 연산자
   * 비교 연산자
   * 논리 연산자
   * 삼항 연산자
 
 #### chapter3
  >문자열
   * 문자열
   * 문자열 비교
   * 특수문자

#### chapter4
  >제어문
   * If
   * Else
   * Else If
   * Switch Case
   * For
   * While
   * Do While
   * 이중반복문
   * 구구단
   * Break 
   * Continue

#### chapter5
  >배열
   * 배열
   * 배열 순회
   * 다차원 배열
   * 다차원 배열 순회
   * 아스키코드

#### chapter6
  >메소드
   * 메소드
   * 전달값(파라미터)
   * 반환값(Return)
   * 전달값과 반환값
   * 메소드 오버로딩
   * 메소드 필요이유
   * 변수의 범위
   * Main 메소드

#### chapter7
  >클래스
   * 클래스
   * 인스턴스 변수
   * 클래스 변수
   * 메소드
   * 메소드 오버로딩
   * 클래스 메소드
   * This
   * 생성자
   * Getter 와 Setter
   * 접근 제어자
   * 패키지
   * 상속
   * 메소드 오버라이딩
   * 다형성
   * Super
   * 참조 (Reference)
   * Final
   * 열거형

#### chapter8
  >추상클래스와 인터페이스
   * 추상 클래스
   * 인터페이스

#### chapter9
  >제네릭스
   * 제네릭스
   * 제네릭 클래스
   * Wrapper 클래스
   * ArrayList 
   * LinkedList
   * HashSet
   * HashMap
   * Iterator

#### chapter10
  >익명클래스, 람다와 스트림
   * 익명 클래스
   * 람다식
   * 함수형 인터페이스
   * 스트림
  
#### chapter11
  > 예외처리
   * 예외처리 (Try Catch)
   * Catch 구문 
   * 예외 발생시키기 (Throw)
   * Finally 구문
   * Try With Resources
   * 사용자 정의 예외
   * 예외 처리 미루기 (Throws)  

#### chapter12
  > 쓰레드
   * Thread
   * Runnable
   * Join
   * 다중 쓰레드
   * 동기화

#### chapter13
  > 입출력과 파일
   * 입력
   * 출력
   * 파일 다루기
   * 폴더 다루기
   * 파일과 폴더 조회
   * 파일 읽고 쓰기
   * 파일 삭제
