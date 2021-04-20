def removeElement(nums,val: int) -> int:
    nums = list(filter(lambda x:x!=val,nums))
    return len(nums)