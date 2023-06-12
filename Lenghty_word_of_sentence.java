package strings;

public class Lenghty_word_of_sentence 
{

	public static void main(String[] kk)
	{
		String s="i am the longest word";
		String[] word=s.split(" ");
		String temp="";
		for(int i=0; i<word.length; i++)
		{
			if(word[i].length()>=temp.length())
			{
				temp=word[i];
			}
		}
		System.out.println(temp);
		System.out.println(temp.length());
	}
}
