class Name
{
 	public static void main(String[] args)
	{
		int num=153,power=0,count=0,temp=num,sum=0,start=1;
		for(;num!=0;num=num/10)
		{
			int rem=num%10;
			count++; 
		
		}     
		System.out.println(count );                  
		num=temp;
		for(;num!=0;num/=10)
		{
			int rem=num%10;
			power=(int)Math.pow(rem,count);
				sum+=power;
		}
		System.out.println(sum);
		num=temp;
		if(sum==temp)
		{
			for(;start<=num;start++)
			{
				if(num%start==0)
					count++;
			}
			if(count==2)
				System.out.println(temp+" arm strong prime");
			else
				System.out.println(temp+" not an armstrong prime");
		}
		else
			System.out.println(temp+" not an armstrong prime");
     }
	
}