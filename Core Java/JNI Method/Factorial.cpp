using namespace std;
#include<bits/stdc++.h>
#include"jni.h"
#include"Demo.h"
JNIEXPORT jint JNICALL Java_Demo_fact(JNIEnv *p, jclass object, jint a)
{
    int b = a;
    int sum = 1;
    for(int i = 1; i <= b; i++)
    {
        sum *= i;
    }
    return sum;
}

