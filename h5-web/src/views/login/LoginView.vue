<script setup lang="ts">
import { reactive } from 'vue'
import { showFailToast, showSuccessToast } from 'vant'
import { useRouter } from 'vue-router'
import { useUserStore } from '../../stores/user'

const router = useRouter()
const userStore = useUserStore()

const form = reactive({
  username: 'demo',
  password: '123456'
})

async function handleSubmit() {
  try {
    await userStore.login(form.username, form.password)
    showSuccessToast('登录成功')
    await router.replace('/home')
  } catch (error) {
    showFailToast(error instanceof Error ? error.message : '登录失败')
  }
}
</script>

<template>
  <div class="page-shell">
    <div class="stack">
      <section class="card">
        <h1 class="page-title">H5 + Spring Boot Starter</h1>
        <p class="page-desc">
          这是一个适合移动端网页项目起步的前端骨架，默认联调 Spring Boot 接口。
        </p>
      </section>

      <section class="card">
        <h2 class="section-title">登录演示</h2>
        <van-form @submit="handleSubmit">
          <van-cell-group inset>
            <van-field v-model="form.username" name="username" label="账号" placeholder="请输入账号" />
            <van-field
              v-model="form.password"
              name="password"
              type="password"
              label="密码"
              placeholder="请输入密码"
            />
          </van-cell-group>
          <div style="margin: 16px 0 0;">
            <van-button round block type="primary" native-type="submit">登录并进入首页</van-button>
          </div>
        </van-form>
      </section>
    </div>
  </div>
</template>
