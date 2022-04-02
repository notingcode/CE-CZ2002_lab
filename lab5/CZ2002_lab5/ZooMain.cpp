#include "Animal.h"
#include "childAnimal.h"

void askQuestion(string* name, int* color, string* owner);

int main() {
	int numMammals, choice, color;
	string p_mammalName, p_ownerName;
	numMammals = 0;
	choice = 0;
	Mammal* mammalPtr[15];

	while(numMammals <= 15 && choice != 5) {
		cout << "[List of Options]";
		cout << "1. Dog, 2. Cat, 3. Lion, 4. Move all animals, 5. Quit\nSelect : ";
		cin >> choice;

		switch (choice) {
			case 1:
				askQuestion(&p_mammalName, &color, &p_ownerName);
				mammalPtr[numMammals] = new Dog(p_mammalName, (COLOR)color, p_ownerName);
				numMammals++;
				break;
			case 2:
				askQuestion(&p_mammalName, &color, &p_ownerName);
				mammalPtr[numMammals] = new Cat(p_mammalName, (COLOR)color, p_ownerName);
				numMammals++;
				break;
			case 3:
				askQuestion(&p_mammalName, &color, &p_ownerName);
				mammalPtr[numMammals] = new Lion(p_mammalName, (COLOR)color, p_ownerName);
				numMammals++;
				break;
			case 4:
				for (int i = 0; i < numMammals; i++) {
					mammalPtr[i]->move();
					mammalPtr[i]->speak();
					mammalPtr[i]->eat();
				}
			case 5:
				break;
			default:
				cout << "Invalid option!!" << endl;
				break;
		}
	}

	return 0;
}

void askQuestion(string* name, int *color, string* owner) {
	cout << "Name : ";
	cin >> *name;

	cout << "Color (0. Green, 1. Blue, 2. White, 3. Black, 4. Brown) : ";
	cin >> *color;

	cout << "Owner name : ";
	cin >> *owner;
}