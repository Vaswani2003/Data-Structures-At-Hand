# ------------------------------------------------------------------------------------------------ #

# Binary Search

# Binary Search is a searching algorithm used in a sorted array by
# repeatedly dividing the search interval in half.

# The idea of binary search is to use the information that
# the array is sorted and reduce the time complexity to O(Log n).

# ------------------------------------------------------------------------------------------------ #


# Binary Search Algorithm: The basic steps to perform Binary Search are:

# -> Begin with the mid element of the whole array as a search key.

# -> If the value of the search key is equal to the item then return an index of the search key.

# -> Or if the value of the search key is less than the item in the middle of the interval,
#    narrow the interval to the lower half.

# -> Otherwise, narrow it to the upper half.

# -> Repeatedly check from the second point until the value is found or the interval is empty.


# ------------------------------------------------------------------------------------------------ #


import numpy

def binary_search( Array, lower, upper, num ) :

    if upper >= lower :
        mid  = (lower + upper)//2

        if Array[mid] == num :
            return mid

        elif num < Array[mid] :
            return binary_search( Array, lower, mid -1 , num )

        else :
            return binary_search( Array, mid+1, upper, num )
    
    else :
        return -1  #element does not exist

# ------------------------------------------------------------------------------------------------ #


# Running the code

data = numpy.array( range(0,101,10) ) # we have a sorted array here 

print('The array is',data)

x = int(input('Enter the element to search :'))

print(f'The index of {x} is {binary_search(data,0,len(data)-1,x)} ')


# ------------------------------------------------------------------------------------------------ #

# Test output :

# The array is [  0  10  20  30  40  50  60  70  80  90 100]
# Enter the element to search :60
# The index of 60 is 6 