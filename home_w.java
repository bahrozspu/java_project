import java.util.*;
public class home_w{
public static void main(String[]args){
	Scanner s =new Scanner(System.in);

		System.out.println("enter your number of Charector name");

			int length=s.nextInt();
			char tex[]=new char[length];

					for(int i=0;i<length;i++)
						{
							System.out.println("enter "+(i+1)+" char");
							tex[i]=s.next().charAt(0);

							}

								System.out.print("your name is   ");
								for(int i=0;i<length;i++){

											System.out.print(tex[i]);

									}
									System.out.println("    ");




		}
		}