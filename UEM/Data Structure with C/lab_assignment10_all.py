class TreeNode:
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None

def insert_node(root, key, direction):
    if root is None:
        return TreeNode(key)
    if direction == "left":
        root.left = insert_node(root.left, key, direction)
    elif direction == "right":
        root.right = insert_node(root.right, key, direction)
    return root

def search_bst(root, key):
    if root is None or root.val == key:
        return root
    if root.val < key:
        return search_bst(root.right, key)
    return search_bst(root.left, key)

def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.val, end=" ")
        inorder_traversal(root.right)

def delete_node_no_child(root, key):
    if root is None:
        return root
    if key < root.val:
        root.left = delete_node_no_child(root.left, key)
    elif key > root.val:
        root.right = delete_node_no_child(root.right, key)
    else:
        if root.left is None and root.right is None:
            root = None
        elif root.left is None:
            root = root.right
        elif root.right is None:
            root = root.left
    return root

def delete_node_one_child(root, key):
    if root is None:
        return root
    if key < root.val:
        root.left = delete_node_one_child(root.left, key)
    elif key > root.val:
        root.right = delete_node_one_child(root.right, key)
    else:
        if root.left is None:
            temp = root.right
            root = None
            return temp
        elif root.right is None:
            temp = root.left
            root = None
            return temp
    return root

def delete_node_two_children(root, key):
    if root is None:
        return root
    if key < root.val:
        root.left = delete_node_two_children(root.left, key)
    elif key > root.val:
        root.right = delete_node_two_children(root.right, key)
    else:
        temp = find_min_value_node(root.right)
        root.val = temp.val
        root.right = delete_node_two_children(root.right, temp.val)
    return root

def find_min_value_node(node):
    current = node
    while current.left is not None:
        current = current.left
    return current

def delete_node(root, key):
    if root is None:
        return root
    if key < root.val:
        root.left = delete_node(root.left, key)
    elif key > root.val:
        root.right = delete_node(root.right, key)
    else:
        if root.left is None:
            temp = root.right
            root = None
            return temp
        elif root.right is None:
            temp = root.left
            root = None
            return temp
        temp = find_min_value_node(root.right)
        root.val = temp.val
        root.right = delete_node(root.right, temp.val)
    return root

def display_menu():
    print("\nMenu:")
    print("1. Insert a node into the binary search tree")
    print("2. Search for an element in the binary search tree")
    print("3. Delete a node having no child from the binary search tree")
    print("4. Delete a node having one child from the binary search tree")
    print("5. Delete a node having two children from the binary search tree")
    print("6. Delete a node from the binary search tree")
    print("7. Display the binary search tree inorder")
    print("8. Exit")

def main():
    root = None
    while True:
        display_menu()
        choice = int(input("Enter your choice: "))
        
        if choice == 1:
            key = int(input("Enter the key to insert: "))
            direction = input("Enter the direction (left/right): ")
            if direction.lower() in ["left", "right"]:
                root = insert_node(root, key, direction.lower())
                print("Node inserted successfully.")
            else:
                print("Invalid direction. Please enter either 'left' or 'right'.")
        elif choice == 2:
            key = int(input("Enter the key to search: "))
            result = search_bst(root, key)
            if result:
                print("Element", key, "found in the binary search tree.")
            else:
                print("Element", key, "not found in the binary search tree.")
        elif choice == 3:
            key = int(input("Enter the key of the node to delete: "))
            root = delete_node_no_child(root, key)
            print("Node with key", key, "deleted from the binary search tree.")
        elif choice == 4:
            key = int(input("Enter the key of the node to delete: "))
            root = delete_node_one_child(root, key)
            print("Node with key", key, "deleted from the binary search tree.")
        elif choice == 5:
            key = int(input("Enter the key of the node to delete: "))
            root = delete_node_two_children(root, key)
            print("Node with key", key, "deleted from the binary search tree.")
        elif choice == 6:
            key = int(input("Enter the key of the node to delete: "))
            root = delete_node(root, key)
            print("Node with key", key, "deleted from the binary search tree.")
        elif choice == 7:
            print("Binary search tree inorder traversal:")
            inorder_traversal(root)
            print()
        elif choice == 8:
            print("Exiting program.")
            break
        else:
            print("Invalid choice. Please enter a valid option.")

if __name__ == "__main__":
    main()
