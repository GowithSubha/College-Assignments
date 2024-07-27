# write a menu driven program in python 
# 1. to create a binary search tree using recursive function and display that.
# 2. to create a binary search tree using non-recursive function and display that.

class TreeNode:
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None

# Function to insert a node into the BST (recursive approach)
def insert_recursive(root, key):
    if root is None:
        return TreeNode(key)
    else:
        if key < root.val:
            root.left = insert_recursive(root.left, key)
        else:
            root.right = insert_recursive(root.right, key)
    return root

# Function to create a BST using recursive approach
def create_bst_recursive():
    root = None
    while True:
        element = input("Enter element to insert (type 'done' to finish): ")
        if element.lower() == 'done':
            break
        try:
            element = int(element)
            root = insert_recursive(root, element)
        except ValueError:
            print("Invalid input! Please enter a valid integer or 'done' to finish.")
    return root

# Function to insert a node into the BST (non-recursive approach)
def insert_non_recursive(root, key):
    if root is None:
        return TreeNode(key)
    current = root
    while True:
        if key < current.val:
            if current.left is None:
                current.left = TreeNode(key)
                break
            else:
                current = current.left
        else:
            if current.right is None:
                current.right = TreeNode(key)
                break
            else:
                current = current.right
    return root

# Function to create a BST using non-recursive approach
def create_bst_non_recursive():
    root = None
    while True:
        element = input("Enter element to insert (type 'done' to finish): ")
        if element.lower() == 'done':
            break
        try:
            element = int(element)
            root = insert_non_recursive(root, element)
        except ValueError:
            print("Invalid input! Please enter a valid integer or 'done' to finish.")
    return root

# Function to perform inorder traversal of the BST
def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.val, end=" ")
        inorder_traversal(root.right)

# Function to perform preorder traversal of the BST
def preorder_traversal(root):
    if root:
        print(root.val, end=" ")
        preorder_traversal(root.left)
        preorder_traversal(root.right)

# Function to perform postorder traversal of the BST
def postorder_traversal(root):
    if root:
        postorder_traversal(root.left)
        postorder_traversal(root.right)
        print(root.val, end=" ")

# Function to display the BST
def display_bst(root):
    print("Binary Search Tree:")
    print("1. Inorder Traversal:", end=" ")
    inorder_traversal(root)
    print()
    print("2. Preorder Traversal:", end=" ")
    preorder_traversal(root)
    print()
    print("3. Postorder Traversal:", end=" ")
    postorder_traversal(root)
    print()

def main():
    bst_recursive = None  # Initialize bst_recursive outside main()
    bst_non_recursive = None  # Initialize bst_non_recursive outside main()
    
    while True:
        print("\nMenu:")
        print("1. Create BST using recursive function")
        print("2. Create BST using non-recursive function")
        print("3. Display BST")
        print("4. Exit")
        choice = input("Enter your choice: ")

        if choice == '1':
            print("Creating BST using recursive function:")
            bst_recursive = create_bst_recursive()
        elif choice == '2':
            print("Creating BST using non-recursive function:")
            bst_non_recursive = create_bst_non_recursive()
        elif choice == '3':
            if bst_recursive:
                display_bst(bst_recursive)
            else:
                print("No BST created using recursive function yet.")
            if bst_non_recursive:
                display_bst(bst_non_recursive)
            else:
                print("No BST created using non-recursive function yet.")
        elif choice == '4':
            print("Exiting...")
            break
        else:
            print("Invalid choice! Please enter a valid option.")

if __name__ == "__main__":
    main()













# # Define a class for the nodes of the binary search tree
# class Node:
#     def __init__(self, data):
#         self.data = data
#         self.left = None
#         self.right = None

# # Define a class for the binary search tree
# class BST:
#     def __init__(self):
#         self.root = None

#     # Define a recursive function to insert a node into the tree
#     def insert_recursive(self, data):
#         # If the tree is empty, create a new node as the root
#         if self.root is None:
#             self.root = Node(data)
#         else:
#             # Call a helper function to insert the node
#             self._insert_recursive(self.root, data)

#     # Define a helper function to insert a node into the tree
#     def _insert_recursive(self, node, data):
#         # If the data is smaller than the node's data, go to the left subtree
#         if data < node.data:
#             # If the left subtree is empty, create a new node as the left child
#             if node.left is None:
#                 node.left = Node(data)
#             else:
#                 # Recursively insert the node into the left subtree
#                 self._insert_recursive(node.left, data)
#         # If the data is larger than the node's data, go to the right subtree
#         elif data > node.data:
#             # If the right subtree is empty, create a new node as the right child
#             if node.right is None:
#                 node.right = Node(data)
#             else:
#                 # Recursively insert the node into the right subtree
#                 self._insert_recursive(node.right, data)
#         # If the data is equal to the node's data, do nothing
#         else:
#             pass

#     # Define a non-recursive function to insert a node into the tree
#     def insert_non_recursive(self, data):
#         # If the tree is empty, create a new node as the root
#         if self.root is None:
#             self.root = Node(data)
#         else:
#             # Initialize a variable to store the current node
#             current = self.root
#             # Loop until the node is inserted
#             while True:
#                 # If the data is smaller than the current node's data, go to the left subtree
#                 if data < current.data:
#                     # If the left subtree is empty, create a new node as the left child
#                     if current.left is None:
#                         current.left = Node(data)
#                         break
#                     else:
#                         # Update the current node to the left child
#                         current = current.left
#                 # If the data is larger than the current node's data, go to the right subtree
#                 elif data > current.data:
#                     # If the right subtree is empty, create a new node as the right child
#                     if current.right is None:
#                         current.right = Node(data)
#                         break
#                     else:
#                         # Update the current node to the right child
#                         current = current.right
#                 # If the data is equal to the current node's data, do nothing
#                 else:
#                     break

#     # Define a recursive function to display the tree in inorder traversal
#     def display_recursive(self):
#         # If the tree is empty, print a message
#         if self.root is None:
#             print("The tree is empty")
#         else:
#             # Call a helper function to display the tree
#             self._display_recursive(self.root)

#     # Define a helper function to display the tree in inorder traversal
#     def _display_recursive(self, node):
#         # If the node is not None, recursively display the left subtree, the node's data, and the right subtree
#         if node is not None:
#             self._display_recursive(node.left)
#             print(node.data, end=" ")
#             self._display_recursive(node.right)

#     # Define a non-recursive function to display the tree in inorder traversal
#     def display_non_recursive(self):
#         # If the tree is empty, print a message
#         if self.root is None:
#             print("The tree is empty")
#         else:
#             # Initialize a stack to store the nodes
#             stack = []
#             # Initialize a variable to store the current node
#             current = self.root
#             # Loop until all the nodes are visited
#             while current or stack:
#                 # If the current node is not None, push it to the stack and go to the left subtree
#                 if current:
#                     stack.append(current)
#                     current = current.left
#                 # If the current node is None, pop a node from the stack, print its data, and go to the right subtree
#                 else:
#                     current = stack.pop()
#                     print(current.data, end=" ")
#                     current = current.right

# # Create an instance of the BST class
# bst = BST()

# # Define a function to display the menu and get the user's choice
# def menu():
#     print("Menu Driven Program for Binary Search Tree")
#     print("1. Insert a node using recursive function")
#     print("2. Insert a node using non-recursive function")
#     print("3. Display the tree using recursive function")
#     print("4. Display the tree using non-recursive function")
#     print("5. Exit")
#     choice = int(input("Enter your choice: "))
#     return choice

# # Loop until the user chooses to exit
# while True:
#     # Get the user's choice
#     choice = menu()
#     # Perform the corresponding operation
#     if choice == 1:
#         # Get the data to insert
#         data = int(input("Enter the data to insert: "))
#         # Insert the node using recursive function
#         bst.insert_recursive(data)
#         print("Node inserted successfully")
#     elif choice == 2:
#         # Get the data to insert
#         data = int(input("Enter the data to insert: "))
#         # Insert the node using non-recursive function
#         bst.insert_non_recursive(data)
#         print("Node inserted successfully")
#     elif choice == 3:
#         # Display the tree using recursive function
#         print("The tree in inorder traversal is: ")
#         bst.display_recursive()
#         print()
#     elif choice == 4:
#         # Display the tree using non-recursive function
#         print("The tree in inorder traversal is: ")
#         bst.display_non_recursive()
#         print()
#     elif choice == 5:
#         # Exit the program
#         print("Thank you for using the program")
#         break
#     else:
#         # Invalid choice
#         print("Please enter a valid choice")
