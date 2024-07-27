# write a menu driven program to perform a following opertion in python:  
#     to take user name as input and display the sorted sequence of characters using BST.
#     to sort a given set of integers using BST.
#     to Count the number of nodes present in an existing BST and display the highest element present in the BST.


class TreeNode:
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None

# Function to insert a character into the BST
def insert_char(root, key):
    if root is None:
        return TreeNode(key)
    else:
        if key < root.val:
            root.left = insert_char(root.left, key)
        else:
            root.right = insert_char(root.right, key)
    return root

# Function to insert an integer into the BST
def insert_int(root, key):
    if root is None:
        return TreeNode(key)
    else:
        if key < root.val:
            root.left = insert_int(root.left, key)
        else:
            root.right = insert_int(root.right, key)
    return root

# Function to count the number of nodes in the BST
def count_nodes(root):
    if root is None:
        return 0
    else:
        return 1 + count_nodes(root.left) + count_nodes(root.right)

# Function to find the maximum element in the BST
def find_max(root):
    if root is None:
        return None
    elif root.right is None:
        return root.val
    else:
        return find_max(root.right)

# Function to perform inorder traversal of the BST
def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.val, end=" ")
        inorder_traversal(root.right)

def main():
    char_root = None
    int_root = None
    
    while True:
        print("\nMenu:")
        print("1. Sort characters using BST")
        print("2. Sort integers using BST")
        print("3. Count nodes and find highest element in BST")
        print("4. Exit")
        choice = input("Enter your choice: ")

        if choice == '1':
            char_input = input("Enter a string: ")
            for char in char_input:
                char_root = insert_char(char_root, char)
            print("Sorted sequence of characters using BST:")
            inorder_traversal(char_root)
            print()
        elif choice == '2':
            int_input = input("Enter integers separated by spaces: ").split()
            for num in int_input:
                num = int(num)
                int_root = insert_int(int_root, num)
            print("Sorted sequence of integers using BST:")
            inorder_traversal(int_root)
            print()
        elif choice == '3':
            if int_root:
                node_count = count_nodes(int_root)
                max_element = find_max(int_root)
                print("Number of nodes in BST:", node_count)
                print("Highest element in BST:", max_element)
            else:
                print("BST is empty.")
        elif choice == '4':
            print("Exiting...")
            break
        else:
            print("Invalid choice! Please enter a valid option.")

if __name__ == "__main__":
    main()
