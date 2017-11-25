import sys

# Usage:
# python dectobin.py NUM0 [NUM1 ... NUMn]
# Prints (badly) the integer and then binary below

for i in range(1, len(sys.argv)):
	rem = [];
	val = int(sys.argv[i])
	while (val > 0):
		rem.append(val%2)
		val = val/2
	print(sys.argv[i])
	print(rem[::-1])

