package problem;

public class Box {
int height,length,width;
Box(int h,int l,int w)
{
	height=h;
	length=l;
	width=w;
}
void display_vol()
{
	System.out.println("Volume of the box is"+height*length*width);
}
}
