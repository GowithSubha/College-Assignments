# Write a menu driven program to perform the following operations on tree:
#     1. to insert (by using a function) a specific element into an existing binary search tree and then display that.
#     2. to search an element in a BST and show the result.


class TreeNode:
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None

# Function to insert a node into the BST
def insert(root, key):
    if root is None:
        return TreeNode(key)
    else:
        if key < root.val:
            root.left = insert(root.left, key)
        else:
            root.right = insert(root.right, key)
    return root

# Function to search for a node in the BST and return the node if found
def search(root, key):
    if root is None or root.val == key:
        return root
    if root.val < key:
        return search(root.right, key)
    return search(root.left, key)

# Function to perform inorder traversal of the BST
def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.val, end=" ")
        inorder_traversal(root.right)

# Function to display the BST
def display_bst(root):
    print("Current state of the BST:")
    inorder_traversal(root)

def main():
    # Creating a default BST
    default_bst = TreeNode(50)
    default_bst.left = TreeNode(30)
    default_bst.right = TreeNode(70)
    default_bst.left.left = TreeNode(20)
    default_bst.left.right = TreeNode(40)
    default_bst.right.left = TreeNode(60)
    default_bst.right.right = TreeNode(80)

    root = default_bst

    while True:
        print("\nMenu:")
        print("1. Insert into BST")
        print("2. Search element in BST")
        print("3. Display BST")
        print("4. Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            element = int(input("Enter element to insert: "))
            position = input("Enter position ('left' or 'right') to insert relative to the root: ")
            if position.lower() == 'left':
                root.left = insert(root.left, element)
            elif position.lower() == 'right':
                root.right = insert(root.right, element)
            else:
                print("Invalid position! Element not inserted.")
        elif choice == 2:
            element = int(input("Enter element to search: "))
            if search(root, element):
                print("Element is present in the BST.")
            else:
                print("Element is not present in the BST.")
        elif choice == 3:
            display_bst(root)
        elif choice == 4:
            print("Exiting...")
            break
        else:
            print("Invalid choice! Please enter a valid option.")

if __name__ == "__main__":
    main()
