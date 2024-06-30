#include<stdio.h>
#include"Input.h"
#include"jni.h"
JNIEXPORT jboolean JNICALL Java_Input_check(JNIEnv *p, jobject obj, jint num)
{
    int i, j, sum = 0;
    i = num;
    while( i != 0)
    {
        j = i % 10;
        sum += (j * j * j);
        i /= 10;
    }
    if(sum == num)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}