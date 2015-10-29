#include <stdio.h>
#include <stdlib.h>
#include "Person.h"

void talk(Personptr p)
{
    printf("Hi, my name is %s\n", p->name);
    printf("and my age is %i\n", p->age);
    printf("\n");
}

void commentAboutAge(Personptr p)
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

Personptr make_person(String aName, int anAge)
{
    Personptr p = malloc(sizeof(Person));
    p->name = aName;
    p->age = anAge;
    return p;
}

int main()
{
    Personptr ls = make_person("Luke Skywalker", 34);
    Personptr wp = make_person("Winston Peters", 48);
    
    talk(ls);
    talk(wp);
}
