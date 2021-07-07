
public class sort {

		public static void main(String[] args) {
			
	       
			int []num={2,34,6,8,5,7,9,11,6,0};
			 for(int i=0;i<10;i++)
			 {
				 for(int j=0;j<10;j++)
				 {
					 if(num[j]>num[j+1])
					 {
						 int temp=num[j];
						 num[j]=num[j+1];
						 num[j+1]=temp;
						 System.out.println(num[j]);
					 }
				 }
			 }
		}

	}
