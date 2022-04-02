#pragma once
#include <iostream>
#include <string>

using namespace std;

enum COLOR {
    Green, Blue, White, Black, Brown
};

class Animal {
public:
    Animal();
    Animal(string n, COLOR c);
    ~Animal();
    virtual void speak();
    virtual void move() = 0;

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal {
public:
    void eat();
    Mammal();
    Mammal(string n, COLOR c);
    ~Mammal();
    void move();
};

