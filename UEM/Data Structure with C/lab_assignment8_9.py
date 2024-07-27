# 9. Write a python program to prove that binary search tree is better than binary tree.
    
    
import random
import time

class TreeNode:
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None

# Function to insert a node into the BST
def insert_bst(root, key):
    if root is None:
        return TreeNode(key)
    else:
        if key < root.val:
            root.left = insert_bst(root.left, key)
        else:
            root.right = insert_bst(root.right, key)
    return root

# Function to insert a node into a regular Binary Tree
def insert_binary_tree(root, key):
    if root is None:
        return TreeNode(key)
    else:
        if root.left is None:
            root.left = TreeNode(key)
        elif root.right is None:
            root.right = TreeNode(key)
        else:
            # Randomly choose between left and right subtrees for insertion
            if random.choice([True, False]):
                insert_binary_tree(root.left, key)
            else:
                insert_binary_tree(root.right, key)
    return root

# Function to search for a node in the BST
def search_bst(root, key):
    if root is None or root.val == key:
        return root
    if root.val < key:
        return search_bst(root.right, key)
    return search_bst(root.left, key)

# Function to search for a node in the regular Binary Tree
def search_binary_tree(root, key):
    if root is None or root.val == key:
        return root
    # Search recursively in left and right subtrees
    left_result = search_binary_tree(root.left, key)
    right_result = search_binary_tree(root.right, key)
    return left_result if left_result else right_result

def main():
    bst_root = None
    binary_tree_root = None
    
    # Generate random values for trees
    values = random.sample(range(1, 10001), 1000)

    # Build BST
    start_time = time.time()
    for value in values:
        bst_root = insert_bst(bst_root, value)
    bst_build_time = time.time() - start_time

    # Build Binary Tree
    start_time = time.time()
    for value in values:
        binary_tree_root = insert_binary_tree(binary_tree_root, value)
    binary_tree_build_time = time.time() - start_time

    print("BST construction time:", bst_build_time)
    print("Binary Tree construction time:", binary_tree_build_time)

    # Search operation
    search_value = random.choice(values)

    start_time = time.time()
    search_bst(bst_root, search_value)
    bst_search_time = time.time() - start_time

    start_time = time.time()
    search_binary_tree(binary_tree_root, search_value)
    binary_tree_search_time = time.time() - start_time

    print("Search time in BST:", bst_search_time)
    print("Search time in Binary Tree:", binary_tree_search_time)

if __name__ == "__main__":
    main()
