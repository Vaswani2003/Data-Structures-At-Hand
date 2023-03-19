# Linear Search

# Linear Search is defined as a sequential search algorithm that starts at one end and goes through 
# each element of a list until the desired element is found, otherwise the search continues till the end of the data set. 
# It is the easiest searching algorithm.
# Iterate from 0 to N-1 and compare the value of every index with x if they match return index.

# follow the given steps to solve the problem:

# --> Start from the leftmost element of arr[ ] and one by one compare x with each element of arr[ ].

# --> If x matches with an element, return the index.

# --> If x doesn’t match with any of the elements, return -1.


# ------------------------------------------------------------------------------------------------ #


import random
from numpy import array as npa 


# ------------------------------------------------------------------------------------------------ #

# Function for Linear Search.

def linear_search(element,arr):
    
    catch = False

    for i,x in enumerate(arr):
        if element == x:
            catch = True
            break

    if catch is True :
        print(f'Element found at {i} index value.')

    else:
        print(f'Element {element} does not exist in array. ')


# ------------------------------------------------------------------------------------------------ #

# Running the code. 

data = npa(random.sample(range(0,100),25))

print('The Array is: ',data)

num = int(input('Enter element you want to search :'))

linear_search(num,data)

# Test Output :
# The Array is:  [14 45 72 38 20  2 83 92 64 29 54 81 36  1 50 32  6 31 43 15 52 23  0 40 30]
# Enter element you want to search :0
# Element found at 22 index value.

# ------------------------------------------------------------------------------------------------ #