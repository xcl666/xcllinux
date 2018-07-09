import re
print "Welcome to the receipt program:"
total = 0;
value = re.compile(r'^[-+]?[0-9]+\.[0-9]+$')
while True:
   price = raw_input("Enter the value for the seat ['q' to quit]: ") 
   number = value.match(price)
   if number:
    total = float(price) + total
   elif price == 'q':
    break
   else:
    print "I'm sorry, but '{}' isn't valid. Please try again.".format(price)
print "*" * 5
print "Total: ${}".format(total)
