#include <stdio.h>
#include <stdlib.h>
#include "Person.h"

void talk(Person* p)
{
    printf("Hi, my name is %s\n", p->name);
    printf("and my age is %i\n", p->age);
    printf("\n");
}

void commentAboutAge(Person* p)
{
    if(p->age < 5)
    {
        printf("baby\n");
    }
    if(p->age == 5)
    {
        printf("time to start school\n");
    }
}

Person* newPerson(char* aName, int anAge)
{
    Person* p = malloc(sizeof(Person));
    p->name = aName;
    p->age = anAge;
    return p;
}

int main()
{
    Person* ls = newPerson("Luke Skywalker", 34);
    Person* wp = newPerson("Winston Peters", 48);
    
    talk(ls);
    talk(wp);
}
