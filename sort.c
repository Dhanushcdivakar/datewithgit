#include<stdio.h>
int main()

{
int a[20];
int i,n=5;
printf("enter the array elements");
for(i=0;i<n;i++){
	scanf("%d",&a[i]);
}

for(i=0;i<n;i++)
{
	if(a[i]>a[i+1]){

		a[i+1]=a[i];

	}
for(i=0;i<n;i++)
{
	printf("%d\n",a[i]);
}
}
}		

	
