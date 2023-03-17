# 신체검사(PhysicalExamination)
- 매개변수를 받아오는 생성자를 생성한다. this를 사용하여 맴버변수랑 매개변수를 구분한다.- 
![image](https://user-images.githubusercontent.com/122009563/225800958-90f0adde-ed3c-46ef-a6db-4f0712241f8a.png)

- 신체정보의 배열을 매개변수로 전달받는다.
- .length를 써서 키만 사용하고 합계(sum) 변수를 만들어주고 for(반복문)을 dat의배열길이만큼 돌린후 각 키의 값을 sum에 저장한다. 
- 누적된 합계(sum)을 배열의 길이로 나누어 평균값을 리턴한다. 
![image](https://user-images.githubusercontent.com/122009563/225798822-542a7cae-64e7-46b5-a845-f0be6d4568c7.png)

- 신체정보와 VMAX의 크기 배열을 매개변수로 받는다.
- for(반복문)을 dist의 배열길이만큼 돌린 후 dist의 배열을 초기값을 0으로 선언한다.

- for(반복문)을 dat의 배열길이만큼 돌리는데, 시력이 0.0이상이고 시력이 VMAX(21)/10.0보다 작으면 시력 * 10을 한다.
- 즉 시력이 0.3이라고 하면 0.3은 0.0보다 크고 2.1보다 작으면 0.3 * 10 = 3이 나온다. 3번 배열방에 카운트를 한다.
- 
![image](https://user-images.githubusercontent.com/122009563/225800248-34810e02-dae6-4d5b-9fe4-072622e535e0.png)

- 객체를 이용하여 학생의 이름, 키, 시력을 매개변수를 생성자로 전달한다.
![image](https://user-images.githubusercontent.com/122009563/225800999-45c3f615-a9c9-4726-b145-49c6323cdee2.png)

- vdist 배열의 방을 VMAX만큼 만든다.
- string 이름, int 키, dounble 시력을 출력한다.
- 평균키도 출력한다.
![image](https://user-images.githubusercontent.com/122009563/225806609-664dd760-74d8-468c-a443-56044134367c.png)
