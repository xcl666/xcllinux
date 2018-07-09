package main

import (
	"fmt"
	"strconv"
	"reflect"
)

func main() {
	var b bool = true
	fmt.Println(reflect.TypeOf(b))
	//var s string = strconv.FormatBool(true)
	var s string = strconv.FormatBool(b)
	fmt.Println(reflect.TypeOf(s))
}
