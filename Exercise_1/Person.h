typedef struct Person
{
    char* name;
    int age;
}Person;

void talk(Person* p);
void commentAboutAge(Person* p);
Person* newPerson(char* aName, int anAge);
