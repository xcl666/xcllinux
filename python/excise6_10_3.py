inventory = ['pepperoni', 'sausage', 'cheese', 'peppers']
topping = ''
topping0 = raw_input("Please give me a topping: ")
if topping0 in inventory:
    print "We have {}.".format(topping0)
    topping = topping0
else:
    print "Sorry, we don't have pineapple."
    topping0 = ''

topping1 = raw_input("Please give me one more topping: ")
if topping1 in inventory:
    print "We have {}.".format(topping1)
    topping = topping0+' '+topping1
else:
    print "Sorry, we don't have pineapple."
print "Here are your toppings:\n['{}']".format(topping.strip())
