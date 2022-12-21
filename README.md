#  지뢰 찾기

## 기능 요구사항
지뢰 찾기를 변형한 프로그램을 구현한다.
- 높이와 너비, 지뢰 개수를 입력받을 수 있다. 
- 지뢰는 눈에 잘 띄는 것으로 표기한다. 
- 지뢰는 가급적 랜덤에 가깝게 배치한다.
- 각 사각형에 표시될 숫자는 자신을 제외한 주변 8개 사각형에 포함된 지뢰의 개수다.

## 프로그래밍 요구 사항
- 객체지향 생활 체조 원칙을 지키면서 프로그래밍한다.
- 객체지향 5원칙(SOLID)
  - SRP (단일책임의 원칙: Single Responsibility Principle): 작성된 클래스는 하나의 기능만 가지며 클래스가 제공하는 모든 서비스는 그 하나의 책임(변화의 축: axis of change)을 수행하는 데 집중되어 있어야 한다 
  - OCP (개방폐쇄의 원칙: Open Close Principle): 소프트웨어의 구성요소(컴포넌트, 클래스, 모듈, 함수)는 확장에는 열려있고, 변경에는 닫혀있어야 한다. 
  - LSP (리스코브 치환의 원칙: The Liskov Substitution Principle): 서브 타입은 언제나 기반 타입으로 교체할 수 있어야 한다. 즉, 서브 타입은 언제나 기반 타입과 호환될 수 있어야 한다. 
  - ISP (인터페이스 분리의 원칙: Interface Segregation Principle): 한 클래스는 자신이 사용하지 않는 인터페이스는 구현하지 말아야 한다. 
  - DIP (의존성역전의 원칙: Dependency Inversion Principle): 구조적 디자인에서 발생하던 하위 레벨 모듈의 변경이 상위 레벨 모듈의 변경을 요구하는 위계관계를 끊는 의미의 역전 원칙이다.
## 기능 명세

Board
- Fields를 가진다.
- 너비, 높이, 지뢰 개수를 기반으로 보드를 만들 수 있다.
- 특정 위치의 필드를 가져올 수 있다.
- 특정 위치 인근의 지뢰를 가져올 수 있다.

BoardGenerateStrategy
- 지뢰를 만드는 전략이다.
- 현재는 랜덤한 위치에 지뢰를 선택하지만 추후에는 다르게 선택할 수 있다.

BoardRandomMineGenerateStrategy
- 랜덤한 위치에 지뢰를 선택한다.

Field
- 영역의 한 공간을 나타내는 클래스이다.
- 자신의 위치(Coordinate)를 가질 수 있다.

Fields
- Field를 가지는 일급 컬렉션이다.
- 가지고 있는 것들 중 위치에 맞는 필드를 가져올 수 있다.
- 가지고 있는 것들 중 위치 인근의 필드들을 가져올 수 있다.

Land
- 일반 지형을 나타낸다.

Mine
- 지뢰 지형을 나타낸다.

Coordinate
- 위치를 나타낸다.
- 너비, 높이를 가진다.

Width
- 너비를 나타낸다.
- 0 이상의 값을 가져야 한다.

Height
- 너비를 나타낸다.
- 0 이상의 값을 가져야 한다.