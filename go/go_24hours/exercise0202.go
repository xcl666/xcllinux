package main

import (
	"fmt"
	"strconv"
	"reflect"
)

func main() {
	var str string = "I am good."
	fmt.Println(reflect.TypeOf(str))
	s,_ := strconv.Atoi(str)
	fmt.Println(s)
	fmt.Println(reflect.TypeOf(s))
}
