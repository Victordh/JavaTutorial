typedef struct Person
{
    char* name;
    int age;
}Person;

/* useful Java-like abbreviation for "char *" */
typedef char *String;

/* useful Java-like abbreviation for "struct Person *" */
typedef struct Person *Personptr;

void talk(Personptr p);
void commentAboutAge(Personptr p);
Personptr make_person(String aName, int anAge);
