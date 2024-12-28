import unittest

def insertion_sort(arr):
    # Start from the second element (index 1)
    for i in range(1, len(arr)):
        # Store the current element to be inserted
        current = arr[i]
        # Start comparing with previous elements
        j = i - 1
        
        # Move elements that are greater than current
        # to one position ahead of their current position
        while j >= 0 and arr[j] > current:
            arr[j + 1] = arr[j]
            j -= 1
            
        # Place current element in its correct position
        arr[j + 1] = current
        
    return arr
