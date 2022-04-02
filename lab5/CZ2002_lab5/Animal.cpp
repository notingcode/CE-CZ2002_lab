#include "Animal.h"

Animal::Animal() : _name("unknown") {
    cout << "constructing Animal object " << _name << endl;
}

Animal::Animal(string n, COLOR c) : _name(n), _color(c) {
    cout << "constructing " << _name << " with color " << COLOR(_color) << endl;
}

Animal::~Animal() {
    cout << "destructing Animal object " << _name << endl;
}

void Animal::speak() {
    cout << "Animal speaks " << endl;
}

void Animal::move() {}


void Mammal::eat() {
    cout << "Mammal eat " << endl;
}

Mammal::Mammal() : Animal() {}

Mammal::Mammal(string n, COLOR c) : Animal(n, c) {}

Mammal::~Mammal() {};

void Mammal::move() {
    cout << "Mammal moves" << endl;
}