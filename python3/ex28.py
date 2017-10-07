class Animal:
    def __init__(self,color):
        self.color = color
    def bark(self):
        print ("Woof")
    
dog=Animal("red")
print(dog.color)
dog.bark()

adog = Animal("blue")
print(adog.color)
adog.bark()
