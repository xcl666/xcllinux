package main

import {
	"fmt"
	"strconv"
}

func main() {
	v := "10"
	if s,err := strconv.Atoi(v); err == nil {
		fmt.Println("%s, %v",s,s)
	}
}
