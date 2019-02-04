package hash;

/***
 * Level2
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
  ��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book��
solution �Լ��� �Ű������� �־��� ��, 
� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return 
�ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.

*����� ����
phone_book	                 |  return
[119, 97674223, 1195524421]  |	false
[123,456,789]	             |  true
[12,123,1235,567,88]		 |	false

����� �� ����
����� �� #1
�տ��� ������ ���� �����ϴ�.

����� �� #2
�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.

����� �� #3
ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.
 */
public class PhoneBook {

	public static void main(String[] args) {
		String[] phone_book = {"12", "212"};
		
		Solution sol = new Solution();
		System.out.println(sol.solution(phone_book));
	}
	
}
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        int i=0,j=0;
        while(i<phone_book.length) {
        	if(j<phone_book.length) {
        		if(phone_book[j] != phone_book[i]) {
        			int length = phone_book[i].length() >= phone_book[j].length() ? phone_book[j].length() : phone_book[i].length();
        			String iString = phone_book[i].substring(0, length);
        			String jString = phone_book[j].substring(0, length);
        			if(iString.equals(jString)) {
        				answer = false;
        				break;
        			}
        			
        		}
        		j++;
        		continue;
        	} else {
        		i+=1;
        		j=0;
        	}
        }
        return answer;
    }
     
}

