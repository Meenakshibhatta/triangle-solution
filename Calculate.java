{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf810
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28300\viewh17700\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
import java.util.*;  \
public class Calculate\{\
static ArrayList storeCoordinateSide = new ArrayList();    \
public static void main(String[] args) \{\
System.out.println("lets calculate the coordinate");\
int[][] input=\{\{0,0\},\{2,4\},\{4,0\}\};\
//int[][] input=new int [3][2];\
// Scanner inputUser = new Scanner(System.in);\
// System.out.println("Enter 3 coordinate of a triangle:(please enter number only)");\
//    String coordinate = inputUser.nextLine();\
//    String[] parts = coordinate.split(",");\
//    String x = parts[0].trim().substring(1).trim();\
//    String y = parts[1].trim().substring(0, parts[1].trim().length() - 1).trim();\
//    System.out.println("x: " + x + "\\ny: " + y);\
//    int col=0;\
//    for(int i=0;i<=2;i++)\{\
//    input[i][col]=Integer.parseInt(x);\
//    input[i][col+1]=Integer.parseInt(y);\
//    \}\
coordinate(input,2);\
\}\
\
public static void coordinate(int[][] parts,int d)\{\
        int columns=0;\
		for(int rows=0;rows<=parts.length;rows++) \{\
		    	int[][] pointa=new int [1][2];\
			    int[][] pointb=new int [1][2];\
			    if(rows==(parts.length-1))\{\
			    pointa[0][0]=parts[rows][columns];\
			    pointa[0][1]=parts[rows][columns+1];\
			    int a=rows+1;\
			    //System.out.println("pointa:"+Arrays.deepToString(pointa));\
			    pointb[0][0]=parts[0][0];\
			    pointb[0][1]=parts[0][1];\
			    //System.out.println("pointb:"+Arrays.deepToString(pointb));\
			    cal(pointa,pointb,d);\
			    break;\
			    \}else\{\
			    pointa[0][0]=parts[rows][columns];\
			    pointa[0][1]=parts[rows][columns+1];\
			    int a=rows+1;\
			    //System.out.println("pointa:"+Arrays.deepToString(pointa));\
			    pointb[0][0]=parts[a][columns];\
			    pointb[0][1]=parts[a][columns+1];\
			    //System.out.println("pointb:"+Arrays.deepToString(pointb));\
			    cal(pointa,pointb,d);\
			    \}\
		\}\
		System.out.println("Final storeCoordinate:"+Arrays.deepToString(storeCoordinateSide.toArray()));\
        noOfTriangle(d);\
\}\
\
public static ArrayList cal(int[][] parts1,int[][] parts2,int d)\{\
int noGap=0;\
double[][] result= new double [1][2]; \
\
    int x1 = parts1[0][0];\
    int y1 = parts1[0][1];\
    \
    int x2 = parts2[0][0];\
    int y2 = parts2[0][1];\
    \
    for(int i1=1;i1<=d;i1++)\{\
    int m = i1;\
    int n = d-noGap;\
    //System.out.println("ratio is:"+m+" "+n);\
    double xr=(double)(m*x2+n*x1)/(m+n);\
    double yr=(double)(m*y2+n*y1)/(m+n);\
    \
    result[0][0]= xr;\
    result[0][1]= yr;\
    storeCoordinateSide.add(result);\
    //System.out.println(Arrays.deepToString(result));\
    noGap++;\
\}\
return storeCoordinateSide;\
\}\
\
public static void noOfTriangle(int d)\{\
int noGap=d+1;\
int noOfTriangle=noGap*noGap;\
System.out.println("no of triangle:"+noOfTriangle);\
\}\
\
\}}