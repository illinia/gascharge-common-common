# gascharge-common-common

모든 프로젝트에서 사용할 수 있는 공통적인 타입, 예외, 유틸 클래스를 담은 모듈

*서브 모듈 의존성 없음, 독립적으로 실행 불가능*

## 수정 내역
### 클래스 필드값 중 null 이 아닌 값이 있는지 확인하는 정적 메서드 추가
query dsl 에서 사용할 목적으로 만든 클래스 DtoFieldNotNullChecker

### Mysql timestamp 타입으로 LocalDateTime 변환해주는 formatter 추가

로컬, 원격 메이븐 레포지토리
```groovy
implementation 'com.gascharge.taemin:gascharge-common-common:0.0.1-SNAPSHOT'
```

멀티 모듈 프로젝트
```groovy
// settings.gradle
includeProject("common", "common")
```
```groovy
// build.gradle
implementation project(":gascharge-common-common")
```