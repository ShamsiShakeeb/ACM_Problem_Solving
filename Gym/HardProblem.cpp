#include<stdio.h>

main(){


    int n,i;

    scanf("%d",&n);

    long long a[n];

    for(i=0;i<n;i++){
        scanf("%lld",&a[i]);
    }
    printf("%d ",a[0]);

       for( i=0;i<n-1;i++){

            printf("%d ",a[i+1]-a[i]);
        }
}
