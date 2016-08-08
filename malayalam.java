
public class malayal {


	public static void main(String[] args){
		//int i,j;
	//char ch;
	String str=args[0];
	char ch[]=str.toCharArray();
	for(int j=0;j<ch.length;j++)
	{
		for(int k=j+1;k<ch.length;k++)
		{
			if(ch[j]==ch[j])
			{
				ch[j]='$';
			
		}
	}
	}
	for(int j=ch.length-1;j>=0;j--)
	{
		if(ch[j]!='$')
		{
			System.out.print(ch[j]);
		}
	}
	}

	

}
