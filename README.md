# 🎉 URECA-Algorithm-Study 화이팅 🎉

## ⭐️ 목표 - 알고리즘 별 개념학습과 관련 문제풀이 및 골드티어 달성!

📌 정기 회의 : 매주 화요일, 금요일 20시

📌 마감 기한 : 매일 오후 23:59분

💸 벌금 : 하루당 1000원

🧸 목표 :  알고리즘 별 개념학습과 관련 문제풀이 및 골드티어 달성!


<details>
  <summary>📘 공부 방법</summary>

- 알고리즘 실력 향상을 위해 만든 Baekjoon문제풀이 스터디
- 1주일간 정해진 알고리즘 개념을 공부하고, 알고리즘에 관련된 필수 문제를 푼 뒤, 서로의 코드를 리뷰한다.
- 백준 익히기는 skip 하고 시작하기 ! (정렬부터)
- 범위는 매주 회의에서 정하기 
</details>
<details>
  <summary>자세히</summary>

- 알고리즘은 수학과 비슷하다. 공식(알고리즘)을 배워서 문제에 적용해 푸는 방식이다.
- 그말은 즉, 한번 진도를 놓치면 상당히 따라가기 힘들다. 그러니 열심히하자!

</details>

## 🔎스터디 참고자료
📚 https://github.com/ghdcksgml1/Algorithm_Study

## 🔗알고리즘 사이트
📚 프로그래머스 https://programmers.co.kr/<br>
📚 백준 https://solved.ac/
<br/>

<br>
(‼️ 해당 스터디는 <a href="https://github.com/tony9402/baekjoon">tony9402</a>님의 알고리즘 문제집을 상당부분 벤치마크 했습니다.)
<br/><br/>


# 👩🏻‍💻🧑🏻‍💻 멤버

<br/>


<table>
    <tr>
      <td height="140px" align="center"> <a href="https://github.com/Minsu17"><img src="https://avatars.githubusercontent.com/u/89891511?s=96&v=4" width="140px" /><br/>👦🏻 서민수 (JAVA)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/seung-heee"><img src="https://avatars.githubusercontent.com/u/112852049?v=4" width="140px" /><br/>👦🏻 노승희 (Python)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/subinsong01"><img src="https://avatars.githubusercontent.com/u/134045937?v=4" width="140px" /><br/>👦🏻 송수빈 (Python)</a></td>
        <td height="140px" align="center"> <a href="https://github.com/99MinSu"><img src="https://avatars.githubusercontent.com/u/89891084?v=4" width="140px" /><br/>👦🏻 이민수 (JAVA)</a></td>
    </tr>
    <tr>
      <td align="center"><a href="https://solved.ac/sms2358"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=sms2358" /></a></td>
      <td align="center"><a href="https://solved.ac/seungheee"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=seungheee" /></a></td>
      <td align="center"><a href="https://solved.ac/haely12"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=haely12" /></a></td>
      <td align="center"><a href="https://solved.ac/dlalstn1023"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=dlalstn1023" /></a></td>
  </tr>
  
</table>
<br/>

##


# 🔗 이용규칙

❗️ 해당 규칙을 지키지 않으면 pull request가 취소 될 수 있다. ❗️

<br/>

### 1️⃣ 문제를 푼 코드 첫째줄에는 다음과 같이 주석을 달자.

백준에 정답을 제출해서 맞췄을 때 나오는 결과를 적어주면 됩니다.

- Example

```c++
  // 언어 : C++ , (성공/실패) : 1/0 , 메모리 : 2796 KB , 시간 : 92ms
```

<img width="721" alt="Screen Shot 2021-08-11 at 1 58 13 PM" src="https://user-images.githubusercontent.com/79779676/128972022-16b13afc-ff52-495a-86a0-26c24691a8a4.png">

<br/><br/>

* JAVA

```java
  // 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 45008 KB , 시간 : 208 ms
```

* Python

```python
  # 언어 : Python , (성공/실패) : 1/4 , 메모리 : 45008 KB , 시간 : 208 ms
```

<br/>

### 2️⃣ 폴더와 파일이름 저장 규칙

예를들어) 문제가 1000_A+B라고 하면,

1. 1000_A+B 폴더에 들어간다.
2. (이름_사용언어) 코드 작성     
   **ex) 이름.java**
   
<br/>

### 3️⃣ 코딩 테스트를 목적으로 하는 스터디이기 때문에 의미없는 변수 남발 x

코딩 테스트에 합격하게 되면, 면접 때 그 코드를 리뷰할 수도 있고

또는, 면접관이 직접 채점하는 경우도 있기 때문에 의미없는 변수를 남발하면 안된다.

- **Example) C++**

```C++
// 문제 : 가격과 물품의 수량을 받아 총 물품의 가격을 출력하는 프로그램을 작성하시오.
// 나쁜 예
#include <iostream>

using namespace std;

int main(void){
  int a,b; // 의미없는 변수
  cin >> a >> b;
  cout << a << b;
}

// 좋은 예
#include <iostream>

using namespace std;

int main(void){
  int price,items; // 변수 이름을 잘 정하자!
  cin >> price >> items;
  cout << price << items;
}
```

- **예외 경우** (문제에서 주어진 변수가 다음과 같을 때)

<img width="291" alt="Screen Shot 2021-08-11 at 2 53 56 PM" src="https://user-images.githubusercontent.com/79779676/128976733-e5cb89fa-9e76-4be7-b43a-461df4a400a3.png">

이럴땐, N,M과 같은 변수를 쓰는게 코드를 보는 입장에서 알아보기 더욱 쉽기 때문에, 그냥 N,M을 변수로 쓴다.

<br/><br/>

### 4️⃣ Pull requests 방법 (제출방법)

<br/>

<a href="https://blog.naver.com/ghdcksgml2/222466153666">Pull requests 방법</a> <= 링크를 타고 들어가면 나옵니다..

<br/><br/>

##

# 📖 진행 순서

<br/>

<table>
  <tr>
    <td align="center">순서</td>
    <td align="center">알고리즘</td>
    <td align="center">문제집</td>
    <td align="center">추천 문제 수</td>
    <td align="center">총 문제 수</td>
    <td align="center">상태</td>
  </tr>
  <tr>
    <td align="center">01</td>
    <td align="center" width="300px">정렬 1</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/01_Sort1">바로가기</a></td>
    <td align="center" width="120px">3</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center" width="300px">정렬 2 (sort함수 사용)</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/02_Sort2">바로가기</a></td>
    <td align="center" width="120px">3</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center" width="300px">수학</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/03_수학">바로가기</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px"></td>
  </tr><tr>
    <td align="center">04</td>
    <td align="center" width="300px">에라토스테네스의 체</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/04_에라토스테네스의%20체">바로가기</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center" width="300px">자료구조 1 (스택,큐,덱)</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/05_자료구조1">바로가기</a></td>
    <td align="center" width="120px">7</td>
    <td align="center" width="120px">7</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">06</td>
    <td align="center" width="300px">자료구조 2 (우선순위 큐)</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/06_자료구조2">바로가기</a></td>
    <td align="center" width="120px">4</td>
    <td align="center" width="120px">4</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">07</td>
    <td align="center" width="300px">동적 프로그래밍 1</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/07_동적%20프로그래밍1">바로가기</a></td>
    <td align="center" width="120px">6</td>
    <td align="center" width="120px">7</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">08</td>
    <td align="center" width="300px">동적 프로그래밍 2</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/08_동적%20프로그래밍2">바로가기</a></td>
    <td align="center" width="120px">7</td>
    <td align="center" width="120px">8</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">09</td>
    <td align="center" width="300px">투 포인터</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/09_투%20포인터">바로가기</a></td>
    <td align="center" width="120px">6</td>
    <td align="center" width="120px">7</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">10</td>
    <td align="center" width="300px">완전 탐색</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/10_완전%20탐색">바로가기</a></td>
    <td align="center" width="120px">6</td>
    <td align="center" width="120px">7</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">11</td>
    <td align="center" width="300px">이분 탐색</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/11_이분%20탐색">바로가기</a></td>
    <td align="center" width="120px">11</td>
    <td align="center" width="120px">11</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">12</td>
    <td align="center" width="300px">백트래킹</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/12_백트래킹">바로가기</a></td>
    <td align="center" width="120px">14</td>
    <td align="center" width="120px">14</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">13</td>
    <td align="center" width="300px">분할 정복</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/13_분할%20정복">바로가기</a></td>
    <td align="center" width="120px">8</td>
    <td align="center" width="120px">8</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">14</td>
    <td align="center" width="300px">문자열 1</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/14_문자열%201">바로가기</a></td>
    <td align="center" width="120px">10</td>
    <td align="center" width="120px">10</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">15</td>
    <td align="center" width="300px">문자열 2</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/15_문자열%202">바로가기</a></td>
    <td align="center" width="120px">9</td>
    <td align="center" width="120px">9</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">16</td>
    <td align="center" width="300px">구현,시뮬레이션</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/16_%EA%B5%AC%ED%98%84%2C%EC%8B%9C%EB%AE%AC%EB%A0%88%EC%9D%B4%EC%85%98">바로가기</a></td>
    <td align="center" width="120px">10</td>
    <td align="center" width="120px">10</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">17</td>
    <td align="center" width="300px">구현,시뮬레이션 (삼성 SW 역량테스트 기출)</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/17_%EA%B5%AC%ED%98%84%2C%EC%8B%9C%EB%AE%AC%EB%A0%88%EC%9D%B4%EC%85%98%20(%EC%82%BC%EC%84%B1%20SW%20%EC%97%AD%EB%9F%89%ED%85%8C%EC%8A%A4%ED%8A%B8%20%EA%B8%B0%EC%B6%9C)">바로가기</a></td>
    <td align="center" width="120px">9</td>
    <td align="center" width="120px">9</td>
    <td align="center" width="80px"></td>
  </tr>
  <tr>
    <td align="center">18</td>
    <td align="center" width="300px">최단거리 (다익스트라)</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/18_%EC%B5%9C%EB%8B%A8%EA%B1%B0%EB%A6%AC%20(%EB%8B%A4%EC%9D%B5%EC%8A%A4%ED%8A%B8%EB%9D%BC)">바로가기</a></td>
    <td align="center" width="120px"></td>
    <td align="center" width="120px"></td>
    <td align="center" width="80px">준비중..</td>
  </tr>
  <tr>
    <td align="center">19</td>
    <td align="center" width="300px">위상정렬</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/19_%EC%9C%84%EC%83%81%EC%A0%95%EB%A0%AC">바로가기</a></td>
    <td align="center" width="120px"></td>
    <td align="center" width="120px"></td>
    <td align="center" width="80px">준비중..</td>
  </tr>
  <tr>
    <td align="center">20</td>
    <td align="center" width="300px">분리 집합 (유니언 파인드)</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/20_%EB%B6%84%EB%A6%AC%20%EC%A7%91%ED%95%A9(%EC%9C%A0%EB%8B%88%EC%96%B8%20%ED%8C%8C%EC%9D%B8%EB%93%9C)">바로가기</a></td>
    <td align="center" width="120px"></td>
    <td align="center" width="120px"></td>
    <td align="center" width="80px">준비중..</td>
  </tr>
  <tr>
    <td align="center">21</td>
    <td align="center" width="300px">트라이</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/21_%ED%8A%B8%EB%9D%BC%EC%9D%B4">바로가기</a></td>
    <td align="center" width="120px"></td>
    <td align="center" width="120px"></td>
    <td align="center" width="80px">준비중..</td>
  </tr>
  <tr>
    <td align="center">22</td>
    <td align="center" width="300px">동적 프로그래밍 트리</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/22_%EB%8F%99%EC%A0%81%20%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%20%ED%8A%B8%EB%A6%AC">바로가기</a></td>
    <td align="center" width="120px"></td>
    <td align="center" width="120px"></td>
    <td align="center" width="80px">준비중..</td>
  </tr>
  <tr>
    <td align="center">23</td>
    <td align="center" width="300px">최소 스패닝 트리</td>
    <td align="center" width="110px"><a href="https://github.com/99MinSu/URECA-Algorithm-Study/tree/main/23_%EC%B5%9C%EC%86%8C%20%EC%8A%A4%ED%8C%A8%EB%8B%9D%20%ED%8A%B8%EB%A6%AC">바로가기</a></td>
    <td align="center" width="120px"></td>
    <td align="center" width="120px"></td>
    <td align="center" width="80px">준비중..</td>
  </tr>
</table>

<br/><br/>

##

