#include<stdio.h>
#include"jni.h"
#include"Demo1.h"
JNIEXPORT jint JNICALL Java_Demo1_get(JNIEnv *p, jobject object, jint num)
{
    int sum = 0;
    for(int i = 0; i <= num; i++)
    {
        sum += i;
    }
    return sum;
}