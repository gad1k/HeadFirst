import os
from pprint import pprint

os.chdir("d:\\repository\\HeadFirst\\Python\\chapter_12")

with open("buzzers.csv") as data:
    ignore = data.readline()
    flights = {}
    for line in data:
        k, v = line.strip().split(",")
        flights[k] = v

print(flights)
print()

pprint(flights)
