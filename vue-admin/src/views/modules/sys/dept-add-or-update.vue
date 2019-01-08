<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="上级部门ID，一级部门为0" prop="parentId">
      <el-input v-model="dataForm.parentId" placeholder="上级部门ID，一级部门为0"></el-input>
    </el-form-item>
    <el-form-item label="部门名称" prop="name">
      <el-input v-model="dataForm.name" placeholder="部门名称"></el-input>
    </el-form-item>
    <el-form-item label="排序" prop="orderNum">
      <el-input v-model="dataForm.orderNum" placeholder="排序"></el-input>
    </el-form-item>
    <el-form-item label="是否删除  -1：已删除  0：正常" prop="delFlag">
      <el-input v-model="dataForm.delFlag" placeholder="是否删除  -1：已删除  0：正常"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          deptId: 0,
          parentId: '',
          name: '',
          orderNum: '',
          delFlag: ''
        },
        dataRule: {
          parentId: [
            { required: true, message: '上级部门ID，一级部门为0不能为空', trigger: 'blur' }
          ],
          name: [
            { required: true, message: '部门名称不能为空', trigger: 'blur' }
          ],
          orderNum: [
            { required: true, message: '排序不能为空', trigger: 'blur' }
          ],
          delFlag: [
            { required: true, message: '是否删除  -1：已删除  0：正常不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.deptId = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.deptId) {
            this.$http({
              url: this.$http.adornUrl(`/sys/dept/info/${this.dataForm.deptId}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.parentId = data.dept.parentId
                this.dataForm.name = data.dept.name
                this.dataForm.orderNum = data.dept.orderNum
                this.dataForm.delFlag = data.dept.delFlag
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/sys/dept/${!this.dataForm.deptId ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'deptId': this.dataForm.deptId || undefined,
                'parentId': this.dataForm.parentId,
                'name': this.dataForm.name,
                'orderNum': this.dataForm.orderNum,
                'delFlag': this.dataForm.delFlag
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
