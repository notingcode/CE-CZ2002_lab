#include "childAnimal.h"

Dog::Dog() : Mammal() {}

Dog::Dog(string n, COLOR c, string o) : Mammal(n, c) {
    owner = o;
}

Dog::~Dog() {}

void Dog::speak() {
    cout << "Woof" << endl;
}

void Dog::move() {
    cout << "Dog moves" << endl;
}

Cat::Cat() : Mammal() {}

Cat::Cat(string n, COLOR c, string o) : Mammal(n, c) {
    owner = o;
}

Cat::~Cat() {}

void Cat::speak() {
    cout << "Cat speaks" << endl;
}

void Cat::move() {
    cout << "Cat moves" << endl;
}

Lion::Lion() : Mammal() {}

Lion::Lion(string n, COLOR c, string o) : Mammal(n, c) {
    owner = o;
}

Lion::~Lion() {}

void Lion::speak() {
    cout << "Roar" << endl;
}

void Lion::move() {
    cout << "Lion moves" << endl;
}