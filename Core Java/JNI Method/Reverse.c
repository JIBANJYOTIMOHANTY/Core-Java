#include<stdio.h>
#include"jni.h"
#include"Demo2.h"
JNIEXPORT jint JNICALL Java_Demo2_reverse(JNIEnv *p, jobject object , jint a)
{
    int sum = 0;
    while(a > 0)
    {
        int rem = a % 10;
        sum = sum * 10 + rem;
        a /= 10;
    }
    return sum;
}