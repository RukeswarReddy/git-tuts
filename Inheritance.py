
# Example for Multilevel Inheritance
class Chicken:
    def Food1(self):
        print("Chicken eats insects and worms")
class Human(Chicken):
    def Food2(self):
        print("Human  eats Chicken")
class Tiger(Human):
    def Food3(self):
        print("Tiger  eats Human")
class Life(Tiger):
    def Food4(self):
        print("Life eats everything")
LC = Life()
LC.Food1()
LC.Food2()
LC.Food3()
LC.Food4()
print()
#Example for single level inheritance
class Sports:
    def Cricket(self):
        print("Iam  Playing cricket")
class Olympics(Sports):
    def Basketball(self):
        print("Iam  playing basketball")
OOO = Olympics()
OOO.Basketball()
OOO.Cricket()