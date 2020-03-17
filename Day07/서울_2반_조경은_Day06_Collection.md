### Code

~~~
import java.util.*;

public class HelloWorld{

	public static void main(String []args){
         
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
       
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
        if(month==1 && (year % 4 == 0) && (year % 100 != 0) || (year % 400) == 0)
        	System.out.println(29 + " days");
        
        else System.out.println(days[month] + " days");
     }
}
~~~

##### 평소에 빠르게 알고리즘 문제를 푸는데에만 집중해서 어떻게 하면 좀 더 효율적이고 보기 좋은 코드를 짤 수 있을 지 깊게 고민해보지 못했는데 그런 것들을 생각해볼수 있어 좋았습니다.
##### 각 달에 알맞은 일 수를 배열에 저장해놓고 배열에서 꺼내어 쓰면 굳이 switch문을 쓰지 않고도 간단하게 일 수를 알아올 수 있었습니다.