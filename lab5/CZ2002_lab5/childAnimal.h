#pragma once
#include "Animal.h"

class Dog : public Mammal {
private:
    string owner;

public:
    Dog();
    Dog(string n, COLOR c, string o);
    ~Dog();

    void speak();
    void move();
};

class Cat : public Mammal {
private:
    string owner;

public:
    Cat();
    Cat(string n, COLOR c, string owner);
    ~Cat();

    void speak();
    void move();
};

class Lion : public Mammal {
private:
    string owner;

public:
    Lion();
    Lion(string n, COLOR c, string owner);
    ~Lion();

    void speak();
    void move();
};