package main

import "fmt"

type Person struct {
	age int
}

func newPerson(age int) *Person {
	person := new(Person)
	person.age = age
	return person
}

func (p Person) Walk() {
	fmt.Println("歩きます")
}

func (p Person) Eat() {
	fmt.Println("食べます")
}

func (p Person) SayAge() {
	fmt.Println(fmt.Sprintf("年齢は%d歳です", p.age))
}

type Child struct {
	Person
}

func (c Child) Walk() {
	c.Person.Walk()
}

func (c Child) Eat() {
	fmt.Print("たくさん")
	c.Person.Eat()
}

type Mouth interface {
	Eat()
}

func main() {
	var person1 *Person = newPerson(30)
	person1.Walk()
	person1.SayAge()
	person1.age = 20
	person1.SayAge()

	person2 := Person{age: 30}
	person2.Walk()
	person2.SayAge()

	child := Child{}
	child.Walk()

	mouthes := []Mouth{Person{}, Child{}}
	for _, mouth := range mouthes {
		mouth.Eat()
	}

}
