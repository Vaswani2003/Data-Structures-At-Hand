# ------------------------------------------------------------------------------------------------ #

# Bubble Sort Algorithm

# Bubble Sort is the simplest sorting algorithm that works by repeatedly
# swapping the adjacent elements if they are in the wrong order.
# This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

# ------------------------------------------------------------------------------------------------ #

# Follow the below steps to solve the problem:

# -> Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
# -> If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
# -> Print the sorted array

# ------------------------------------------------------------------------------------------------ #


# Below is the implementation of the above approach:


# ------------------------------------------------------------------------------------------------ #


import random
from numpy import array as npa


# ------------------------------------------------------------------------------------------------ #


data = npa( random.sample(range(-100,101),20) )

print('The Array Before Bubble Sorting is :',data)

def BubbleSort(A) :
  for i in range(len(A)) :
    for j in range ( len(A) - i - 1 ) :
      if A[j] > A[j+1] :
        A[j] , A[j+1] = A[j+1], A[j]
  return A

print( 'The Array After Bubble Sort is :',BubbleSort(data) )


# ------------------------------------------------------------------------------------------------ #

# Test output 

# The Array Before Bubble Sorting is : [-17  82  15  65  83  35 -71 -30  89  -2  53 -86 -59  43  -9 -33  41  34 -62  64]
# The Array After Bubble Sort is : [-86 -71 -62 -59 -33 -30 -17  -9  -2  15  34  35  41  43  53  64  65  82  83  89]