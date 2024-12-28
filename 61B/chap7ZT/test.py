import unittest

from insertionSort import insertion_sort

class TestInsertionSort(unittest.TestCase):
    def test_empty_list(self):
        """Test sorting an empty list"""
        input_list = []
        expected = []
        insertion_sort(input_list)
        self.assertEqual(input_list, expected)
        
    def test_single_element(self):
        """Test sorting a list with one element"""
        input_list = [1]
        expected = [1]
        insertion_sort(input_list)
        self.assertEqual(input_list, expected)
        
    def test_sorted_list(self):
        """Test sorting an already sorted list"""
        input_list = [1, 2, 3, 4, 5]
        expected = [1, 2, 3, 4, 5]
        insertion_sort(input_list)
        self.assertEqual(input_list, expected)
        
    def test_reverse_sorted_list(self):
        """Test sorting a reverse sorted list"""
        input_list = [5, 4, 3, 2, 1]
        expected = [1, 2, 3, 4, 5]
        insertion_sort(input_list)
        self.assertEqual(input_list, expected)
        
    def test_random_list(self):
        """Test sorting a randomly ordered list"""
        input_list = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
        expected = sorted(input_list.copy())  # Using Python's built-in sort as reference
        insertion_sort(input_list)
        self.assertEqual(input_list, expected)
        
    def test_duplicate_elements(self):
        """Test sorting a list with duplicate elements"""
        input_list = [4, 2, 2, 8, 3, 3, 1]
        expected = [1, 2, 2, 3, 3, 4, 8]
        insertion_sort(input_list)
        self.assertEqual(input_list, expected)
        
    def test_string_list(self):
        """Test sorting a list of strings"""
        input_list = ["banana", "apple", "cherry", "date"]
        expected = ["apple", "banana", "cherry", "date"]
        insertion_sort(input_list)
        self.assertEqual(input_list, expected)

if __name__ == '__main__':
    # Run the tests
    unittest.main(exit=False)
    
    # Example usage of the insertion sort
    print("\nExample Usage:")
    example_list = [6, 3, 7, 2, 8, 1]
    print("Original list:", example_list)
    insertion_sort(example_list)
    print("Sorted list:", example_list)
    
    # Example with strings
    string_list = ["dog", "cat", "bird", "ant"]
    print("\nOriginal string list:", string_list)
    insertion_sort(string_list)
    print("Sorted string list:", string_list)